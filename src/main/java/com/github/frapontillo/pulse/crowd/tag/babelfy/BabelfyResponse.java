package com.github.frapontillo.pulse.crowd.tag.babelfy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Francesco Pontillo
 */
public class BabelfyResponse extends ArrayList<BabelfyTag> {
    private List<String> tags;

    public BabelfyResponse() {
        tags = null;
    }

    public List<String> getTags(String text) {
        if (tags == null) {
            tags = new ArrayList<String>(this.size());
            for (BabelfyTag babelfyTag : this) {
                BabelfyTag.BabelfyCharFragment charFragment = babelfyTag.getCharFragment();
                tags.add(text.substring(charFragment.getStart(), charFragment.getEnd() + 1));
            }
        }
        return tags;
    }
}
