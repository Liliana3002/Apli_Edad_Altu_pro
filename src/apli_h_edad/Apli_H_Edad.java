/*Dadas la edades y alturas de 5 estudiantes, mostrar la edad y la estatura media
y la cantidad de estudiantes >18 años y 
la cantidad de estudiantes que miden más de 1,75 */
package apli_h_edad;
import javax.swing.JOptionPane;
public class Apli_H_Edad {
    
    public static void main(String[] args) {
        //Declarar variables
        int edad, sumaE=0, conteoM18=0, contadorM175=0;
        float H, sumaH=0, mediaE, mediaH;
        
        //Bucle for para que se agreguen los datos de 5 estudiantes diferentes
        for (int e=1; e<=5; e++){
            
            edad=Integer.parseInt(JOptionPane.showInputDialog ("Estudiante" +e+ "\nDigite su edad:"));
            H=Float.parseFloat(JOptionPane.showInputDialog ("Estudiante" +e+ "\nDigite su estatura:"));
            
            //Suma el número de edades
            sumaE +=edad;
            
            //Suma el número de estaturas
            sumaH +=H;  
            
            //Calcular estudiantes >18
            if(edad > 18){
                conteoM18++;
            }
            //Calcular estatura >175
            if(H > 1.75){
                contadorM175++;
            }
            }
            mediaE = (float) sumaE/5;
            mediaH = (float) sumaH/5;
            
            JOptionPane.showMessageDialog (null, "La edad promedio es:\n" +mediaE);
            JOptionPane.showMessageDialog (null, "La estatura promedio es\n:" +mediaH);
            JOptionPane.showMessageDialog (null, "El número de estudiantes mayores de 18 son:\n" +conteoM18);
            JOptionPane.showMessageDialog (null, "El número de estudiantes con estatura mayor a 1,75 es:\n" +contadorM175);
            }
            
        }
    