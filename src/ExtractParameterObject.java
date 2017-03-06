/**
 * Created by Eren on 2/26/2017.
 */
public class ExtractParameterObject {

    public int[] returnInt(ExtractedParameters extractedParameters){

        int e = extractedParameters.getA() + extractedParameters.getB();
        int f = extractedParameters.getC() + extractedParameters.getD();

        return new int[] {e, f};

    }

    private static class ExtractedParameters {
        private final int a;
        private final int b;
        private final int c;
        private final int d;

        private ExtractedParameters(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public int getD() {
            return d;
        }
    }
}
