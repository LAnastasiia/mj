package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJWhileLoop extends MJStatementNode {
    @Child MJExpressionNode condition;
    @Child MJStatementNode statement;

    public MJWhileLoop(MJExpressionNode condition, MJStatementNode statement) {
        this.condition = condition;
        this.statement = statement;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        while (condition.executeBool(frame))
            statement.execute(frame);
        return null;
    }

}
