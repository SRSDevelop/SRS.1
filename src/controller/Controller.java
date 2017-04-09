package controller;

import gui.Button;
import gui.Dialog;

public class Controller {

	public void buttonPressed(Button button) {
		if (button.getText().equals("Save"))
			_buttonSave();
		else if (button.getText().equals("Load"))
			_buttonLoad();
		else if (button.getText().equals("Play")) {
			// _model.startPlaying();
			System.out.println("Controller.buttonPressed got Play button");
		} else if (button.getText().equals("Stop")) {
			// _model.stopPlaying();
			System.out.println("Controller.buttonPressed got Stop button");
		} else if (button.getText().equals("Quit"))
			_buttonQuit();
		else
			System.out.println("Controller.buttonPressed " + button + " pressed");
	}

	private void _buttonQuit() {
		if (Dialog.askYesNo("Exiting program", "Really quit?"))
			System.exit(0);
	}

	private void _buttonLoad() {
		System.out.println("Controller._buttonLoad called");
	}

	private void _buttonSave() {
		System.out.println("Controller._buttonSave called");
	}

	public void keyPressed(int keyCode) {
		System.out.println("Controller.keyPressed " + keyCode);
	}

	public void keyReleased(int keyCode) {
		System.out.println("Controller.keyReleased " + keyCode);
	}

	public void keyTyped(char keyChar) {
		System.out.println("Controller.keyTyped '" + keyChar + "'");
	}

}
