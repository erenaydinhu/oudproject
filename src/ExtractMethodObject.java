/**
 * Created by Eren on 2/26/2017.
 */
public class ExtractMethodObject {

        public double returnDouble(){

            double d = new Calculate().invoke();

        return d;



    }

    private class Calculate {
        public double invoke() {
            double a = 3.6;
            double b = 4.7;
            double c = 15.2;
            double d = ( a + (2* b));
            d = d * (2 + c);
            return d;
        }
    }
}
