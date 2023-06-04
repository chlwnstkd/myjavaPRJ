package kakao;

import java.time.LocalTime;

public class traffic {
    public static void main(String[] args) {

        String[] lines = {
                "2016-09-15 03:10:33.020 0.011s",
                "2016-09-15 03:10:34.123 1.123s",
                "2016-09-15 03:10:45.111 2.222s"
        };

        int maxThroughput = solution(lines);
        System.out.println("초당 최대 처리량: " + maxThroughput);
    }

    public static int solution(String[] lines) {
        int maxThroughput = 0;

        for (int i = 0; i < lines.length; i++) {
            String[] log = lines[i].split(" ");
            String[] responseTime = log[1].split(":");
            int hours = Integer.parseInt(responseTime[0]);
            int minutes = Integer.parseInt(responseTime[1]);
            double seconds = Double.parseDouble(responseTime[2]);
            double processingTime = Double.parseDouble(log[2].substring(0, log[2].length() - 1));

            LocalTime startTime = LocalTime.of(hours, minutes, (int) seconds).minusSeconds((long) (processingTime - 0.001));
            LocalTime endTime = LocalTime.of(hours, minutes, (int) seconds);
            int count = 0;

            for (int j = i; j < lines.length; j++) {
                String[] nextLog = lines[j].split(" ");
                String[] nextResponseTime = nextLog[1].split(":");
                int nextHours = Integer.parseInt(nextResponseTime[0]);
                int nextMinutes = Integer.parseInt(nextResponseTime[1]);
                double nextSeconds = Double.parseDouble(nextResponseTime[2]);
                double nextProcessingTime = Double.parseDouble(nextLog[2].substring(0, nextLog[2].length() - 1));

                LocalTime nextStartTime = LocalTime.of(nextHours, nextMinutes, (int) nextSeconds).minusSeconds(3);
                LocalTime nextEndTime = LocalTime.of(nextHours, nextMinutes, (int) nextSeconds);

                if (nextStartTime.isBefore(endTime) || nextStartTime.equals(endTime)) {
                    count++;
                } else if (nextEndTime.isBefore(startTime)) {
                    break;
                }
            }

            if (count > maxThroughput) {
                maxThroughput = count;
            }
        }

        return maxThroughput;
    }
}
