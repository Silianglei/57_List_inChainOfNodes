/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
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
         int size = 0;
         Node curNode = headReference;
         while( curNode!= null){
             size++;
             curNode = curNode.getReferenceToNextNode();
         }
         return size;
     }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
      public String toString() {
        String result = "[";
        Node curNode = headReference;
        for( int el = 0; el < size(); el++){
            result += curNode.getCargoReference() + ",";
            curNode = curNode.getReferenceToNextNode();
        }
        return result += "]";
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
