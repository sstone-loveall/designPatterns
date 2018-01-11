package com.machineghost.designPatterns.behavioral.command;

/**
 * Command pattern demo. This object represents the Command Interface.
 * @author S. Stone-Loveall
 *
 */
public interface ICommand {
	
	public boolean execute();
	public void undo();
	
}
