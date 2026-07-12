class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) 
    {
        long time1,time2;
        time1= Integer.parseInt(startTime.substring(0,2))*3600 + Integer.parseInt(startTime.substring(3,5))*60+Integer.parseInt(startTime.substring(6,8));
        time2= Integer.parseInt(endTime.substring(0,2))*3600 + Integer.parseInt(endTime.substring(3,5))*60+Integer.parseInt(endTime.substring(6,8));
        return (int)(time2-time1);
    }
}