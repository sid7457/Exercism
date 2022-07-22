
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
    }

    public int getToday() {
        if(birdsPerDay.length!=0)
            return birdsPerDay[birdsPerDay.length-1];//throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        return 0;
    }

    public void incrementTodaysCount() {

        birdsPerDay[birdsPerDay.length-1]++;
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i< birdsPerDay.length;i++)
            if(birdsPerDay[i] == 0)
                return true;

        return false;
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res=0;
        if(numberOfDays > birdsPerDay.length)
            numberOfDays= birdsPerDay.length;
        for(int i=0;i<numberOfDays;i++)
            res+=birdsPerDay[i];
        return res;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int cnt=0;
        for(int i=0;i<birdsPerDay.length;i++)
            if(birdsPerDay[i]>=5)
                cnt++;
        return cnt;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
