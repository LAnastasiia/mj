package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo
public abstract class MJExpressionNode extends Node {
    public abstract Object executeGeneric(VirtualFrame frame);

    public int executeI32(VirtualFrame frame) {
        Object result = executeGeneric(frame);
        if (result instanceof Integer)
            return (int) result;
        CompilerDirectives.transferToInterpreter();
        throw new Error("type mismatch");
    }

    public boolean executeBool(VirtualFrame frame) {
        Object result = executeGeneric(frame);
        if (result instanceof Boolean)
            return (boolean) result;
        CompilerDirectives.transferToInterpreter();
        throw new Error("type mismatch");
    }

    public float executeFloat(VirtualFrame frame) {
        Object result = executeGeneric(frame);
        if (result instanceof Float)
            return (float) result;
        CompilerDirectives.transferToInterpreter();
        throw new Error("type mismatch");
    }
}
