package b;

import b.StringDrink;
import b.StringTransformer;

import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> list;
    public StringTransformerGroup (List<StringTransformer> list) {
        this.list = list;
    }
    public void execute(StringDrink drink) {
        for (StringTransformer stringTransformer : list) {
            stringTransformer.execute(drink);
        }
    }

}
