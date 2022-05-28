public class line3 {

    public static void main(String[] args) {
        System.out.println(spaceShip(30,675,4));
    }

    public static int solution(int fuel, int[] powers, int[] distances) {
        int answer = 0;


        return answer;
    }

    public static double spaceShip(int power, int distance, int fuel){
        if(distance<=power){
            return 1;
        }
        distance -= (fuel*power)*fuel / 2;
        return (double)distance / (fuel*power) + fuel;
    }
}
