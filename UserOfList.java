/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );

        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() + " list: " + list);
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        list.add(2, "b");
        System.out.println(list +
                            System.lineSeparator());
        list.remove(3);
        System.out.println(list +
                          System.lineSeparator());
        list.set(1, "q");
        System.out.println(list +
                          System.lineSeparator());

        System.out.println(list.get(2) +
                          System.lineSeparator());

    }
}
