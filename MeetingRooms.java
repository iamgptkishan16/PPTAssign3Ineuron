import java.util.Arrays;

public class MeetingRooms {
    public static boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        // Check if there is any overlap between consecutive meetings
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false; // Overlapping meetings, cannot attend all
            }
        }
        
        return true; // No overlapping meetings, can attend all
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean result = canAttendMeetings(intervals);
        System.out.println("Can attend all meetings: " + result);
    }
}
