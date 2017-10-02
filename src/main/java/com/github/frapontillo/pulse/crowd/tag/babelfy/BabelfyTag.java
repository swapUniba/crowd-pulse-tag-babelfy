package com.github.frapontillo.pulse.crowd.tag.babelfy;

/**
 * @author Francesco Pontillo
 */
public class BabelfyTag {
    private BabelfyCharFragment charFragment;

    public BabelfyCharFragment getCharFragment() {
        return charFragment;
    }

    public void setCharFragment(BabelfyCharFragment charFragment) {
        this.charFragment = charFragment;
    }

    public class BabelfyCharFragment {
        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
