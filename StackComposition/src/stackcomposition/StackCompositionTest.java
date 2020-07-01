package stackcomposition;

public class StackCompositionTest {

    public static void main(String[] args) {
        StackComposition<Integer> stack = new StackComposition<>();

        // use push method
        stack.push( -1 );
        System.out.println(stack);
        stack.push( 0 );
        System.out.println(stack);
        stack.push( 1 );
        System.out.println(stack);
        stack.push( 5 );
        System.out.println(stack);

        // remove items from stack
        try
        {
            Object removedObject = null;

            while ( true )
            {
                removedObject = stack.pop(); // use pop method
                System.out.printf( "%s popped\n", removedObject );
                System.out.println(stack);
            } // end while
        } // end try
        catch ( IndexOutOfBoundsException emptyListException )
        {
            emptyListException.printStackTrace();
        } // end catch
    }
}
