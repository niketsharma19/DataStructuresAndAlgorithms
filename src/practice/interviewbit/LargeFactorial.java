package practice.interviewbit;
import java.math.BigInteger;

public class LargeFactorial {
    public String solve(int A) {
        return fac(BigInteger.valueOf(A)).toString();
    }
    
    private BigInteger fac(BigInteger n){
        if (n.equals(BigInteger.ONE)) {
			return BigInteger.ONE;
		}
		return n.multiply(fac(n.add(BigInteger.valueOf(-1))));
    }
}
