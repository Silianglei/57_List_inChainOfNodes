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
         Node currentNode = headReference;
         while( currentNode!= null){
             size++;
             currentNode = currentNode.getReferenceToNextNode();
         }
         return size;
     }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
      public String toString() {
        String str = "[";
        Node currentNode = headReference;
        for( int i = 0; i < size(); i++){
            str += currentNode.getCargoReference() + ",";
            currentNode = currentNode.getReferenceToNextNode();
        }
        return str += "]";
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

     public boolean add(int index, Object val) {
       Node currentNode = headReference;
       for(int i = 0; i < size(); i++) {

         if(i == (index - 1)) {
           Node newNode = new Node(val, currentNode.getReferenceToNextNode());
           currentNode.setReferenceToNextNode(newNode);
         }
         currentNode = currentNode.getReferenceToNextNode();
       }
          return true;

     }

     public Object remove( int index) {
       Node currentNode = headReference;
       Object oldValue = "";
       for(int i = 0; i < size(); i++) {

         if(i == (index - 1)) {
           oldValue = currentNode.getReferenceToNextNode().getCargoReference();
           currentNode.setReferenceToNextNode(currentNode.getReferenceToNextNode().getReferenceToNextNode());
                  }
         currentNode = currentNode.getReferenceToNextNode();
       }
        return oldValue;
     }
     public Object set(int index, Object val) {
       Node currentNode = headReference;
       Object oldValue = "";
       for(int i = 0; i < size(); i++) {
         if(i == index) {
           oldValue = currentNode.getCargoReference();
           currentNode.setcargoReference(val);
                  }
         currentNode = currentNode.getReferenceToNextNode();

       }
       return oldValue;
     }

     public Object get(int index) {
       Node currentNode = headReference;
       Object val = "";
       for(int i = 0; i < size(); i++) {
         if(i == index) {
           val = currentNode.getCargoReference();
                  }
         currentNode = currentNode.getReferenceToNextNode();

       }
        return val;
     }
}
