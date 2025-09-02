import java.util.*;
package Test;

interface DrawingAction{
	void perform();
	void undo();
}

class DrawLine implements DrawingAction{
	public void perform() {
		System.out.println("Line Drawn");
	}
	public void undo() {
		System.out.println("Undo Line Drawn");
	}
}
class DrawCircle implements DrawingAction{
	public void perform() {
		System.out.println("Circle Drawn");
	}
	public void undo() {
		System.out.println("Undo Circle Drawn");
	}
	
}
class DrawShape implements DrawingAction{
	public void perform() {
		System.out.println("Shape Drawn");
	}
	public void undo() {
		System.out.println("Undo Shape Drawn");
	}
}
class Erase implements DrawingAction{
	public void perform() {
		System.out.println("Erased Shape");
	}
	public void undo() {
		System.out.println("Restored Shape");
	}
	
}

class DrawingApp{
	private Stack<DrawingAction> actionStack = new Stack<>();
    public void performAction(DrawingAction action) {
        action.perform();
        actionStack.push(action);
    }

    public void undo() {
        if (!actionStack.isEmpty()) {
            DrawingAction lastAction = actionStack.pop();
            lastAction.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
    

	
}
public DrawingAppAction {

	public static void main(String[] args) {
		DrawingApp app = new DrawingApp();
		
		app.performAction(new DrawLine());
		
		// TODO Auto-generated method stub

	}

}
