public class Lasagna {
    final static int Preparation_Time = 40;
    final static int Layer_Preparation_Time = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return Preparation_Time;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time) {
        return Preparation_Time-time;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * Layer_Preparation_Time;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int ovenTime) {
        return layers * Layer_Preparation_Time + ovenTime;
    }
}
