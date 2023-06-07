package kakao;

import java.util.*;

public class traffic_solution {
    public int solution(String[] lines) {
        int answer = 0;
        List<Log> logs = new ArrayList<>();

        // 로그 데이터 파싱
        for (String line : lines) {
            String[] split = line.split(" ");
            String[] time = split[1].split(":");
            int processTime = (int) (Double.parseDouble(split[2].replace("s", "")) * 1000);

            int endTime = getTimeToMilliseconds(time);
            int startTime = endTime - processTime + 1;

            logs.add(new Log(startTime, endTime));
        }

        // 초당 최대 처리량 계산
        for (Log log : logs) {
            int cnt = 0;
            int startRange = log.endTime;
            int endRange = startRange + 1000;

            for (Log target : logs) {
                if (target.startTime < endRange && target.endTime >= startRange)
                    cnt++;
            }

            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    private int getTimeToMilliseconds(String[] time) {
        int hour = Integer.parseInt(time[0]) * 3600000;
        int minute = Integer.parseInt(time[1]) * 60000;
        int second = (int) (Double.parseDouble(time[2]) * 1000);
        return hour + minute + second;
    }

    class Log {
        int startTime;
        int endTime;

        Log(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}