package homework;

public class PowersOfTwo {

    String first_name;

    int f(int x, int y) {
        int z = 1;
        for(int i = 0; i < y; i++) {
            z = z * x;
        }
        return z;
    }

    public static void main(String[] args) {
        PowersOfTwo powersOfTwo = new PowersOfTwo();
        int base_var = 2;
        int exp_var = 10;
        int base_var_of_pow_exp_var = powersOfTwo.f(base_var, exp_var);
        System.out.println(base_var + " to the " + exp_var + " is " + base_var_of_pow_exp_var);
        System.out.println(base_var + " ^ " + exp_var + " is " + base_var_of_pow_exp_var);

//		int _ = 10;
    }
}
