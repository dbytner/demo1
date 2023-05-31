package pl.coderslab.web.form;

public class Calculate {

    public static String calculate(double a, double b, double c){
        double delta = Math.pow(b, 2) - (4 * a * c);
        if(delta > 0){
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            return "Pierwiaski równania to " + x1 + " i " + x2;
        } else if(delta == 0){
            double x1 = -b / (2 * a);
            return "Równanie ma jeden pierwiastek " + x1;
        }
        return "Równanie nie ma pierwiastków";
    }
}
