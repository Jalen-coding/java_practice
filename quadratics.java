import java.util.Scanner;

public class quadratics {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a, b, c,root;
        double root1, root2, x, y, directrix;
        char direction;
        
        //get ab and c
        System.out.println("Enter a,b,c as coefficents: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a==0){
            System.out.println("a cannot equal 0");
            System.exit(0);
        }

        //define determinant
        double determinant = b*b -4 *a *c;

        root1=0;
        root2=0;
        if (determinant>0){
            root1 = (-b + Math.sqrt(determinant))/(2*a);
            root1 = (-b - Math.sqrt(determinant))/(2*a);
            root = 2;
        }else if (determinant == 0){
            root1 = root2 =-b/(2.0*a);
            root = 1;
        }else{
            root = 0;
        }

        System.out.printf("f(x) = %dx^2 + %dx + %d \n",a,b,c);


        if(root==2){
            System.out.printf("Roots: %.2f \n",root1,root2);
        }
        else if(root==1){
            System.out.printf("Root: %.2f \n",root1);
        }
        else{
            System.out.printf("No real roots \n");
        }

        //quadratic vertex
        x = -b/(2.0*a);
        y = a*Math.pow(x,2)+b*x+c;
        System.out.printf("Vertex: (%.2f, %.2f) \n",x,y);

        //direction of directrix
        double p = 1.0/(4*a);
        directrix = y-p;
        
        direction=' ';
        if(p<0){
            direction = 'D';
        }else if(p>0){
            direction = 'U';
        }
        System.out.printf("Directrix: y = %.2f \n",directrix);
        
        if(direction=='D'){
            System.out.println("The graph is facing down");
        }
        else if(direction =='U'){
            System.out.println("The graph is facing up");
        }
        scan.close();
    }
}
