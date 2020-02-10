// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.dsl.UnsupportedSpecializationException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJBinaryNode;
import org.truffle.cs.mj.nodes.MJExpressionNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.AddNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.BooleanAnd;
import org.truffle.cs.mj.nodes.MJBinaryNode.BooleanOR;
import org.truffle.cs.mj.nodes.MJBinaryNode.DiffNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.DivNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.EqualNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.GreaterEqualNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.GreaterNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.LessThanEqualNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.LessThanNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.MulNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.NotNode;
import org.truffle.cs.mj.nodes.MJBinaryNode.RemNode;

@GeneratedBy(MJBinaryNode.class)
public final class MJBinaryNodeFactory {

    @GeneratedBy(BooleanOR.class)
    public static final class BooleanORNodeGen extends BooleanOR {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private BooleanORNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            boolean xValue_ = this.x_.executeBool(frameValue);
            boolean yValue_ = this.y_.executeBool(frameValue);
            if (state != 0 /* is-active booleanOr(boolean, boolean) */) {
                return booleanOr(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            boolean xValue_ = this.x_.executeBool(frameValue);
            boolean yValue_ = this.y_.executeBool(frameValue);
            if (state != 0 /* is-active booleanOr(boolean, boolean) */) {
                return booleanOr(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Boolean) {
                boolean xValue_ = (boolean) xValue;
                if (yValue instanceof Boolean) {
                    boolean yValue_ = (boolean) yValue;
                    this.state_ = state = state | 0b1 /* add-active booleanOr(boolean, boolean) */;
                    return booleanOr(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static BooleanOR create(MJExpressionNode x, MJExpressionNode y) {
            return new BooleanORNodeGen(x, y);
        }

    }
    @GeneratedBy(BooleanAnd.class)
    public static final class BooleanAndNodeGen extends BooleanAnd {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private BooleanAndNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            boolean xValue_ = this.x_.executeBool(frameValue);
            boolean yValue_ = this.y_.executeBool(frameValue);
            if (state != 0 /* is-active booleanAnd(boolean, boolean) */) {
                return booleanAnd(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            boolean xValue_ = this.x_.executeBool(frameValue);
            boolean yValue_ = this.y_.executeBool(frameValue);
            if (state != 0 /* is-active booleanAnd(boolean, boolean) */) {
                return booleanAnd(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Boolean) {
                boolean xValue_ = (boolean) xValue;
                if (yValue instanceof Boolean) {
                    boolean yValue_ = (boolean) yValue;
                    this.state_ = state = state | 0b1 /* add-active booleanAnd(boolean, boolean) */;
                    return booleanAnd(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static BooleanAnd create(MJExpressionNode x, MJExpressionNode y) {
            return new BooleanAndNodeGen(x, y);
        }

    }
    @GeneratedBy(LessThanNode.class)
    public static final class LessThanNodeGen extends LessThanNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private LessThanNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active lessThan(int, int) */) {
                return lessThan(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active lessThan(int, int) */) {
                return lessThan(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active lessThan(int, int) */;
                    return lessThan(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static LessThanNode create(MJExpressionNode x, MJExpressionNode y) {
            return new LessThanNodeGen(x, y);
        }

    }
    @GeneratedBy(LessThanEqualNode.class)
    public static final class LessThanEqualNodeGen extends LessThanEqualNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private LessThanEqualNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active lessThanEqual(int, int) */) {
                return lessThanEqual(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active lessThanEqual(int, int) */) {
                return lessThanEqual(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active lessThanEqual(int, int) */;
                    return lessThanEqual(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static LessThanEqualNode create(MJExpressionNode x, MJExpressionNode y) {
            return new LessThanEqualNodeGen(x, y);
        }

    }
    @GeneratedBy(EqualNode.class)
    public static final class EqualNodeGen extends EqualNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private EqualNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            if ((state & 0b10) == 0 /* only-active equal(int, int) */ && state != 0  /* is-not equal(int, int) && equal(Object, Object) */) {
                return executeGeneric_int_int0(frameValue, state);
            } else {
                return executeGeneric_generic1(frameValue, state);
            }
        }

        private Object executeGeneric_int_int0(VirtualFrame frameValue, int state) {
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            assert (state & 0b1) != 0 /* is-active equal(int, int) */;
            return equal(xValue_, yValue_);
        }

        private Object executeGeneric_generic1(VirtualFrame frameValue, int state) {
            Object xValue_ = this.x_.executeGeneric(frameValue);
            Object yValue_ = this.y_.executeGeneric(frameValue);
            if ((state & 0b1) != 0 /* is-active equal(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return equal(xValue__, yValue__);
                }
            }
            if ((state & 0b10) != 0 /* is-active equal(Object, Object) */) {
                return equal(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            if ((state & 0b10) == 0 /* only-active equal(int, int) */ && state != 0  /* is-not equal(int, int) && equal(Object, Object) */) {
                return executeBool_int_int2(frameValue, state);
            } else {
                return executeBool_generic3(frameValue, state);
            }
        }

        private boolean executeBool_int_int2(VirtualFrame frameValue, int state) {
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            assert (state & 0b1) != 0 /* is-active equal(int, int) */;
            return equal(xValue_, yValue_);
        }

        private boolean executeBool_generic3(VirtualFrame frameValue, int state) {
            Object xValue_ = this.x_.executeGeneric(frameValue);
            Object yValue_ = this.y_.executeGeneric(frameValue);
            if ((state & 0b1) != 0 /* is-active equal(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return equal(xValue__, yValue__);
                }
            }
            if ((state & 0b10) != 0 /* is-active equal(Object, Object) */) {
                return equal(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active equal(int, int) */;
                    return equal(xValue_, yValue_);
                }
            }
            this.state_ = state = state | 0b10 /* add-active equal(Object, Object) */;
            return equal(xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else if ((state & (state - 1)) == 0 /* is-single-active  */) {
                return NodeCost.MONOMORPHIC;
            }
            return NodeCost.POLYMORPHIC;
        }

        public static EqualNode create(MJExpressionNode x, MJExpressionNode y) {
            return new EqualNodeGen(x, y);
        }

    }
    @GeneratedBy(NotNode.class)
    public static final class NotNodeGen extends NotNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private NotNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            if ((state & 0b10) == 0 /* only-active not(int, int) */ && state != 0  /* is-not not(int, int) && not(Object, Object) */) {
                return executeGeneric_int_int0(frameValue, state);
            } else {
                return executeGeneric_generic1(frameValue, state);
            }
        }

        private Object executeGeneric_int_int0(VirtualFrame frameValue, int state) {
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            assert (state & 0b1) != 0 /* is-active not(int, int) */;
            return not(xValue_, yValue_);
        }

        private Object executeGeneric_generic1(VirtualFrame frameValue, int state) {
            Object xValue_ = this.x_.executeGeneric(frameValue);
            Object yValue_ = this.y_.executeGeneric(frameValue);
            if ((state & 0b1) != 0 /* is-active not(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return not(xValue__, yValue__);
                }
            }
            if ((state & 0b10) != 0 /* is-active not(Object, Object) */) {
                return not(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            if ((state & 0b10) == 0 /* only-active not(int, int) */ && state != 0  /* is-not not(int, int) && not(Object, Object) */) {
                return executeBool_int_int2(frameValue, state);
            } else {
                return executeBool_generic3(frameValue, state);
            }
        }

        private boolean executeBool_int_int2(VirtualFrame frameValue, int state) {
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            assert (state & 0b1) != 0 /* is-active not(int, int) */;
            return not(xValue_, yValue_);
        }

        private boolean executeBool_generic3(VirtualFrame frameValue, int state) {
            Object xValue_ = this.x_.executeGeneric(frameValue);
            Object yValue_ = this.y_.executeGeneric(frameValue);
            if ((state & 0b1) != 0 /* is-active not(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return not(xValue__, yValue__);
                }
            }
            if ((state & 0b10) != 0 /* is-active not(Object, Object) */) {
                return not(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active not(int, int) */;
                    return not(xValue_, yValue_);
                }
            }
            this.state_ = state = state | 0b10 /* add-active not(Object, Object) */;
            return not(xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else if ((state & (state - 1)) == 0 /* is-single-active  */) {
                return NodeCost.MONOMORPHIC;
            }
            return NodeCost.POLYMORPHIC;
        }

        public static NotNode create(MJExpressionNode x, MJExpressionNode y) {
            return new NotNodeGen(x, y);
        }

    }
    @GeneratedBy(GreaterNode.class)
    public static final class GreaterNodeGen extends GreaterNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private GreaterNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active greater(int, int) */) {
                return greater(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active greater(int, int) */) {
                return greater(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active greater(int, int) */;
                    return greater(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static GreaterNode create(MJExpressionNode x, MJExpressionNode y) {
            return new GreaterNodeGen(x, y);
        }

    }
    @GeneratedBy(GreaterEqualNode.class)
    public static final class GreaterEqualNodeGen extends GreaterEqualNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private GreaterEqualNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active greaterEqual(int, int) */) {
                return greaterEqual(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public boolean executeBool(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active greaterEqual(int, int) */) {
                return greaterEqual(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active greaterEqual(int, int) */;
                    return greaterEqual(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static GreaterEqualNode create(MJExpressionNode x, MJExpressionNode y) {
            return new GreaterEqualNodeGen(x, y);
        }

    }
    @GeneratedBy(AddNode.class)
    public static final class AddNodeGen extends AddNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private AddNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active add(int, int) */) {
                return add(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public int executeI32(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active add(int, int) */) {
                return add(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active add(int, int) */;
                    return add(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static AddNode create(MJExpressionNode x, MJExpressionNode y) {
            return new AddNodeGen(x, y);
        }

    }
    @GeneratedBy(DiffNode.class)
    public static final class DiffNodeGen extends DiffNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private DiffNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active diff(int, int) */) {
                return diff(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public int executeI32(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active diff(int, int) */) {
                return diff(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active diff(int, int) */;
                    return diff(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static DiffNode create(MJExpressionNode x, MJExpressionNode y) {
            return new DiffNodeGen(x, y);
        }

    }
    @GeneratedBy(MulNode.class)
    public static final class MulNodeGen extends MulNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private MulNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active mul(int, int) */) {
                return mul(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public int executeI32(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active mul(int, int) */) {
                return mul(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active mul(int, int) */;
                    return mul(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static MulNode create(MJExpressionNode x, MJExpressionNode y) {
            return new MulNodeGen(x, y);
        }

    }
    @GeneratedBy(DivNode.class)
    public static final class DivNodeGen extends DivNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private DivNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active div(int, int) */) {
                return div(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public int executeI32(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active div(int, int) */) {
                return div(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active div(int, int) */;
                    return div(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static DivNode create(MJExpressionNode x, MJExpressionNode y) {
            return new DivNodeGen(x, y);
        }

    }
    @GeneratedBy(RemNode.class)
    public static final class RemNodeGen extends RemNode {

        @Child private MJExpressionNode x_;
        @Child private MJExpressionNode y_;
        @CompilationFinal private int state_;

        private RemNodeGen(MJExpressionNode x, MJExpressionNode y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object executeGeneric(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active rem(int, int) */) {
                return rem(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        @Override
        public int executeI32(VirtualFrame frameValue) {
            int state = state_;
            int xValue_ = this.x_.executeI32(frameValue);
            int yValue_ = this.y_.executeI32(frameValue);
            if (state != 0 /* is-active rem(int, int) */) {
                return rem(xValue_, yValue_);
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active rem(int, int) */;
                    return rem(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static RemNode create(MJExpressionNode x, MJExpressionNode y) {
            return new RemNodeGen(x, y);
        }

    }
}
