package org.truffle.cs.mj.main;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import org.truffle.cs.mj.parser.RecursiveDescendScanner;
import org.truffle.cs.mj.parser.RecursiveDescentParser;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleRuntime;

public class MJRuntime {

    public static void main(String[] args) {
        parseRD(ifProgram);
        // parseRD(mjProgramRD);
// parseRD(whileLoopRD);
// parseRD(ifProgram);
// parseRDBenchmark(divAlgorithm);
    }

    static String SimpleProgram = ""//
                    + "program Sample { "//
                    + "void main() { \n"//
                    + "     print(1+2);\n"//
                    + "     print(1-2);\n"//
                    + "     print(3*6);\n"//
                    + "     print(6/10);\n"//
                    + "     print(12%10);\n"//
                    + "         }\n"//
                    + "}";

    static String SimpleProgram1 = ""//
                    + "program Sample { "//
                    + "void main(int i)int p; { \n"//
                    + "     print(1+2*5/2);\n"//
                    + "     p=i+1;\n"//
                    + "     print(p);\n"//
                    + "     if(i==0 || i==2) {"//
                    + "         print(i);" //
                    + "         }\n"//
                    + "     else{\n"//
                    + "         print(i + 2);"//
                    + "         }\n"//
                    + "}}";

    static String SimpleProgram2 = ""//
                    + "program Sample { "//
                    + "int main(int i)int p; { \n"//
                    + "     p=0;\n"//
                    + "     while(p < i) {"//
                    + "         print(p);" //
                    + "         p=p+1;" //
                    + "     }\n"//
                    + "     return p;\n"//
                    + "         }\n"//
                    + "}";

    static String mjProgramRD = ""//
                    + "program Sample { "//
                    + "void main() int i; int j; { \n"//
                    + "                 print(0);"//
                    + "                 print(12); \n" //
                    + "                 i = 3;\n"//
                    + "                 print(i);\n"//
                    + "                 print(i+12);\n"//
                    + "                 j=12;\n"//
                    + "                 print(i+j+12);\n"//
                    + "         }\n"//
                    + "}";

    static String whileLoopRD = "program P {"//
                    + "             void foo(int i,int j) {print(i+j);}" //
                    + "             void main () int i;{ "//
                    + "                 i =0; "//
                    + "                 while(i<10) {"//
                    + "                     print(i); "//
                    + "                     i=i+1;"//
                    + "                     foo(i,2);" //
                    + "                 }"//
                    + "             }"//
                    + "}";
    static String ifProgram = "program P {"//
                    + "             void foo(int i,int j) {"//
                    + "                 if(i>j) {"//
                    + "                     print(i);" //
                    + "                 }else {"//
                    + "                     print(j);"//
                    + "                 }"//
                    + "                 print(0);"//
                    + "             }" //
                    + "             void main () int i;{ "//
                    + "                 i =0; "//
                    + "                 while(i<10) {"//
                    + "                     i=i+1;"//
                    + "                     foo(i,5);" //
                    + "                 }"//
                    + "             }"//
                    + "}";

    static String divAlgorithm = "program DivAlgorithm {"//
                    + "             int flipSign(int a) int neg;int tmp; int tmpA; {" //
                    + "                 neg = 0;"//
                    + "                 tmp = 0;" //
                    + "                 tmpA = a;"//
                    + "                 if(a < 0){"//
                    + "                     tmp = 1;"//
                    + "                 } else {"//
                    + "                     tmp = -1;"//
                    + "                 }" //
                    + "                 while(tmpA != 0) {"//
                    + "                     neg = neg + tmp;"//
                    + "                     tmpA = tmpA + tmp;"//
                    // + " print(tmpA);"//
                    // + " print(neg);"//
                    + "                 }"//
                    + "                 return neg;"//
                    + "             }"//
                    + "             int sub(int a,int b) {"//
                    + "                 return a + flipSign(b);"//
                    + "             }"//
                    + "             int mul(int a,int b) int sum;int i; {"//
                    + "                 if(a<b) {"//
                    + "                     return mul(b,a);"//
                    + "                 }"//
                    + "                 sum = 0;"//
                    + "                 i =abs(b);"//
                    + "                 while(i>0) {"//
                    + "                     sum = sum +a;"//
                    + "                     i = i-1;"//
                    + "                 }"//
                    + "                 if(b < 0){"//
                    + "                     sum = flipSign(sum);"//
                    + "                 }"//
                    + "                 return sum;"//
                    + "             }" //
                    + "             void main (int a,int b){ " //
                    + "                 print(mul(a,b));"//
                    + "             }"//
                    + "}";

    static void parseRD(String code) {
        InputStream is = new ByteArrayInputStream(code.getBytes());
        RecursiveDescendScanner scanner = new RecursiveDescendScanner(new InputStreamReader(is));
        RecursiveDescentParser parser = new RecursiveDescentParser(scanner);
        parser.parse();
        TruffleRuntime runtime = Truffle.getRuntime();
        System.out.println("Calling main function...");
        CallTarget callTarget = runtime.createCallTarget(parser.getMain());
        // here you increase
        for (int i = 0; i < 10000; i++) {
            System.out.println(callTarget.call(i % 3));
        }
    }

    static void parseRDBenchmark(String code) {
        InputStream is = new ByteArrayInputStream(code.getBytes());
        RecursiveDescendScanner scanner = new RecursiveDescendScanner(new InputStreamReader(is));
        RecursiveDescentParser parser = new RecursiveDescentParser(scanner);
        parser.parse();
        TruffleRuntime runtime = Truffle.getRuntime();
        System.out.println("Calling main function...");
        CallTarget callTarget = runtime.createCallTarget(parser.getMain());
        System.out.println("#################################################################");
        Random r = new Random(17);

        long start = System.currentTimeMillis();
        callTarget.call(123123, -12312312);
        long initialTimeNeeded = (System.currentTimeMillis() - start);
        System.out.println("Time needed " + initialTimeNeeded);

        // warmup
        for (int i = 0; i < 100; i++) {
            callTarget.call(i, i % 2 == 0 ? -i : i);
            callTarget.call(i % 2 == 0 ? -i : i, i);
        }
        for (int i = 0; i < 1000; i++) {
            callTarget.call(i, r.nextInt(1000));
        }
        System.out.println("#################################################################");
        start = System.currentTimeMillis();
        callTarget.call(123123, -12312312);
        System.out.println("Time needed " + (System.currentTimeMillis() - start) + "  | vs initial time=" + initialTimeNeeded);
        System.out.println("#################################################################");
    }

}
