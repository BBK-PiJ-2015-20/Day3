int n1 = 0;
int max = 0;
println " Enter a serie of numbers and when you want to stop enter -1:"

while ( n1 != -1){
String str = System.console().readLine()
 n1 = Integer.parseInt(str);
 if (n1 > max){
 max = n1;
 }
}
println " The highest number you entered is : " + max;