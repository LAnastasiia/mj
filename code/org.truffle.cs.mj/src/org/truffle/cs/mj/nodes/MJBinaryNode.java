package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "x", type = MJExpressionNode.class)
@NodeChild(value = "y", type = MJExpressionNode.class)
public abstract class MJBinaryNode extends MJExpressionNode {
    public static abstract class BooleanOR extends MJBinaryNode {
        @Specialization
        public boolean booleanOr(boolean x, boolean y) {
            return x || y;
        }

        @Specialization
        public boolean booleanOr(int x, int y) {
            return x != 0 || y != 0;
        }

        @Specialization
        public boolean booleanOr(float x, float y) { return x != 0 || y != 0; }
    }

    public static abstract class BooleanAnd extends MJBinaryNode {
        @Specialization
        public boolean booleanAnd(boolean x, boolean y) {
            return x && y;
        }

        @Specialization
        public boolean booleanAnd(int x, int y) {
            return x != 0 && y != 0;
        }

        @Specialization
        public boolean booleanAnd(float x, float y) {
            return x != 0 && y != 0;
        }
    }

    public static abstract class LessThanNode extends MJBinaryNode {
        @Specialization
        public boolean lessThan(int x, int y) {
            return x < y;
        }

        @Specialization
        public boolean lessThan(float x, float y) {
            return x < y;
        }
    }

    public static abstract class LessThanEqualNode extends MJBinaryNode {
        @Specialization
        public boolean lessThanEqual(int x, int y) {
            return x <= y;
        }

        @Specialization
        public boolean lessThanEqual(float x, float y) {
            return x <= y;
        }
    }

    public static abstract class EqualNode extends MJBinaryNode {
        @Specialization
        public boolean equal(int x, int y) {
            return x == y;
        }

        @Specialization
        public boolean equal(float x, float y) {
            return x == y;
        }

        @Specialization
        public boolean equal(Object x, Object y) {
            return x == y;
        }
    }

    public static abstract class NotNode extends MJBinaryNode {
        @Specialization
        public boolean not(int x, int y) {
            return x != y;
        }

        @Specialization
        public boolean not(float x, float y) {
            return x != y;
        }

        @Specialization
        public boolean not(Object x, Object y) {
            return x != y;
        }
    }

    public static abstract class GreaterNode extends MJBinaryNode {
        @Specialization
        public boolean greater(int x, int y) {
            return x > y;
        }

        @Specialization
        public boolean greater(float x, float y) {
            return x > y;
        }
    }

    public static abstract class GreaterEqualNode extends MJBinaryNode {
        @Specialization
        public boolean greaterEqual(int x, int y) {
            return x >= y;
        }

        @Specialization
        public boolean greaterEqual(float x, float y) { return x >= y; }
    }

    public static abstract class AddNode extends MJBinaryNode {
        @Specialization
        public int add(int x, int y) {
            return x + y;
        }

        @Specialization
        public float add(float x, float y) {
            return x + y;
        }
    }

    public static abstract class DiffNode extends MJBinaryNode {
        @Specialization
        public int diff(int x, int y) {
            return x - y;
        }

        @Specialization
        public float diff(float x, float y) {
            return x - y;
        }
    }

    public static abstract class MulNode extends MJBinaryNode {
        @Specialization
        public int mul(int x, int y) {
            return x * y;
        }

        @Specialization
        public float mul(float x, float y) {
            return x * y;
        }
    }

    public static abstract class DivNode extends MJBinaryNode {
        @Specialization
        public int div(int x, int y) {
            return x / y;
        }

        @Specialization
        public float div(float x, float y) {
            return x / y;
        }
    }

    public static abstract class RemNode extends MJBinaryNode {
        @Specialization
        public int rem(int x, int y) { return x % y; }

        @Specialization
        public float rem(float x, float y) { return x % y; }
    }
}
