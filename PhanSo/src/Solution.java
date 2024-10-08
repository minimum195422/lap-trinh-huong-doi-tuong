/**
 * Lớp Solution.
 */
public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Lấy tử số.
     * @return numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Cài tử số.
     * @param numerator giá trị tử số.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Lấy mẫu số.
     * @return denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Cài mẫu số.
     * @param denominator giá trị mẫu số.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Hàm khởi tạo không tham số.
     */
    public Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * Hàm khởi tạo.
     * @param numerator tử số.
     * @param denominator mẫu số.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    /**
     * Phương thức reduce thực hiện rút gọn phân số.
     */
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        if (denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        return this;
    }

    /**
     * Phương thức gcd.
     *
     * @param a số nguyên thứ nhất.
     * @param b số nguyên thứ hai.
     * @return ước chung lớn nhất của hai số a và b.
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        if (a == b) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Phương thức add.
     *
     * @param other phân số cộng thêm.
     * @return phân số hiện tại sau khi cộng.
     */
    public Solution add(Solution other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator *= other.denominator;
        return this.reduce();
    }

    /**
     * Phương thức subtract.
     *
     * @param other phân số bị trừ.
     * @return phân số hiện tại sau khi trừ.
     */
    public Solution subtract(Solution other) {
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator *= other.denominator;
        return this.reduce();
    }

    /**
     * Phương thức multiply.
     *
     * @param other phân số nhân thêm.
     * @return phân số hiện tại sau khi nhân.
     */
    public Solution multiply(Solution other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        return this.reduce();
    }

    /**
     * Phương thức divide.
     *
     * @param other phân số bị chia.
     * @return phân số hiện tại sau khi chia.
     */
    public Solution divide(Solution other) {
        if (other.numerator == 0) {
            return this;
        }
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        return this.reduce();
    }

    /**
     * Phương thức equals.
     * @param obj phân số nhận vào.
     * @return boolean.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other = other.reduce();
            return other.getNumerator() == this.reduce().getNumerator()
                    && other.getDenominator() == this.reduce().getDenominator();
        }
        return false;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
