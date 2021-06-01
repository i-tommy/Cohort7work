public class Kata {

    public int findFactorize(int number){
        int factorize = 1;

        while (number > 1){
            factorize *= number;
            number--;
        }

        return factorize;

    }

}
