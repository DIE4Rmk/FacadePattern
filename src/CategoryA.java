/**
 * Class of normal memes.
 */
public class CategoryA {
    private final String text;
    private final short cringeLvl;
    public long likesCount;

    CategoryA(String text, short cringeLvl, long likesCount) {
        this.cringeLvl = cringeLvl;
        this.text = text;
        this.likesCount = likesCount;
    }

    public void printCringeStatus(IMemesVisitor visitor) {
        visitor.visit(this);
    }

}
