package org.flow;

import org.luaj.vm2.script.LuaScriptEngine;

import javax.swing.*;

public class Flow2D {

    private static JPanel pane;
    private static LuaScriptEngine engine;
    public static JPanel getPanel(){
        return pane;
    }
    public static void setEngine(LuaScriptEngine repl){
        engine = repl;
    }

    public static LuaScriptEngine getEngine(){
        return engine;
    }

    public static void setPanel(JPanel one){
        pane = one;
    }
}
