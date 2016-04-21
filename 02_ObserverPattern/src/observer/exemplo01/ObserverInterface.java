package observer.exemplo01;
/**
 * Exemplo retirado do javacodegeeks
 * https://www.javacodegeeks.com/2015/09/observer-design-pattern.html.
 * 
 * DESIGN PATTERN OBSERVER
 * 
 * @author Edney Roldao
 *
 */
public interface ObserverInterface {
	
	/**
	 * method is called by the subject on the observer in order to notify it, when there is a change in the state of the subject.
	 * @param desc
	 */
	void update(String desc);
	
	/**
	 * method is used to subscribe itself with the subject.
	 */
	void subscribe();
	
	/**
	 * method is used to unsubscribe itself with the subject.
	 */
	void unSubscribe();

}