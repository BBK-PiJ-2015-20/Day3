String str = "";
println " Enter 1st number:"
str = System.console().readLine()
int n1 = Integer.parseInt(str)
println "Enter the 2nd number:"
str = System.console().readLine()
int n2 = Integer.parseInt(str)
println "Enter the 3rd number:"
str = System.console().readLine()
int n3 = Integer.parseInt(str)

if (n1 > n2){
 if (n2 > n3){
  println n3 + " " + n2 + " " + n1;
 }
 else if (n3 > n1){
 println n2 + " " + n1 + " " + n3;
 }
else 
 println n2 + " " + n3 + " " + n1;
}
else if (n1 > n3){
 println n3 + " " + n1 + " " + n2;
} 
else if (n2 > n3)
 println n1 + " " + n3 + " " + n2; 
else 
println n1 + " " + n2 + " " + n3;
 
