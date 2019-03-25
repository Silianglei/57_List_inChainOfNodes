/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursive{
    private Node headReference;

    /**
         Construct an empty list
        */
       public List_inChainOfNodes(){
       }

       /**
         Construct a list given a headReference
        */
       public List_inChainOfNodes(Node headReference){
           this.headReference = headReference;
       }

    /**
      @return the number of elements in this list
     */
     public int size() {
       if (headReference == null) {
         return 0;
       }
       List_inChainOfNodes_recursive smallerList = new List_inChainOfNodes_recursive(headReference.getReferenceToNextNode);
       return 1 + smallerList.size();
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
     public String toString() {
       String noBrackets;
       if (size() == 0) {
         noBrackets = "";
       }
       else {
         List_inChainOfNodes_recursive smallerList = new List_inChainOfNodes_recursive(headReference.getReferenceToNextNode);
        noBrackets = headReference.getCargoReference() + ", " + smallerList.toString();
      }
        return "[" + noBrackets + "]"
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
       Node newNode = new Node(val, headReference);
       headReference = newNode;
        return true;
      }
}
