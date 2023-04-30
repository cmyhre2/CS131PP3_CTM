

/**
 * This class models a Node object which contains type T. Each
 * node has its internal data (a type T) and pointers to the next 
 * node in the list. Class uses generics to work with any data type.
 * Type T turns into the desired data type once instantiated.
 * 
 * @author rkelley/njohnson (v1.0) & Chris Myhre (v1.1)
 * @version 1.1 (CS-131 Module 3 Project)
 * Spring 2023 (03/30/2023)
 */
public class GenericNode<T> {
	
	private T data;  //data that the object stores, of type T to support any type of data
	private GenericNode<T> nextNode; //pointer to the nextNode that will be in GenericLinkedList, of type T to support any type of data
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the type T data of the object, type T = choosen data type upon instantiation.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the type T data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller. 
	 * @return
	 */
	public GenericNode<T> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next type T node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode<T> nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the node stored in the next type T node pointer.
	 * @return Node object
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class
