package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJStatementExpression extends MJStatementNode {

    @Child MJExpressionNode expr;

    public MJStatementExpression(MJExpressionNode expr) {
        this.expr = expr;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        expr.executeGeneric(frame);
        return null;
    }

}
