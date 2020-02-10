package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.FrameDescriptor;

import org.truffle.cs.mj.nodes.MJReturnNode.MJReturnException;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo
public class MJFunction extends RootNode {

    final String name;

    @Child MJStatementNode body;

    public MJFunction(String name, MJStatementNode body, FrameDescriptor frameDescriptor) {
        super(null, frameDescriptor);
        this.body = body;
        this.name = name;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        try {
            body.execute(frame);
        } catch (MJReturnException e) {
            return e.value;
        }

        return null;
    }

    @TruffleBoundary
    private static void print() {
        System.out.print("_");
    }

    @Override
    public String getName() {
        return name;
    }
}
