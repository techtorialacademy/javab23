package Primitives.Numerical;

public class LongType {
    // Size: 64 bit
    // Range: Bigger than integer
    // Use: It is only used when the number is too big that `int` data type can't store
    // It is always a good practice to add `L` or `l` at the end of long values.
    public static void main(String[] args){
        // creating a long variable
        long distance = 9876543738838L;
        // As we can see it above we used long data type to store value that cannot
        // be stored in `int` data type.

        // Can we store small values with long data type as well?
        long smallValue = 1L; // the answer is yes

        // Detail:
        // When do we have to use `L` at the end of the value and when is it fine
        // to not use it?
        // If the value that you will store in long data type can be stored in `int`
        // type, then you do not need to use `L` at the end of value.

        // 1.200.000 -> 1.2 million -> can I store this value in `int` data type?
        // yes, we can. So it means, if I assign a long data type with this value
        // I don't have to use `L`.
        long var1 = 1200000;
        long var2 = 1200000L;
        // Both assignments for Long data type above are fine.

        // 2.200.000.000-> 2.2 billion -> can I store this value in `int` data type?
        // No, we can't. -> This means that I must add `L` at the end of the value
        // to assign for long data type.
        long var3 = 2200000000L;





    }
}
