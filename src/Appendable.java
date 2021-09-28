// Professor, I couldn't see how to implement <?> into this problem... Here's my solution using generics instead.

interface Appendable<T> {

    T append(T a);
}

class MyString implements Appendable <MyString> {

    private String str;

    public MyString(String s){
        this.str = s;
    }

    public MyString append(MyString a){
        return new MyString(this.str + a);
    }
}

// I had such a hard time trying to implement this with MyList. With Strings it was a lot easier... Anyhow, this is what
// I got, professor. It isn't much, but at least I tried hard. I will be watching some more YouTube videos on the subject.

class MyList implements Appendable <MyList> {

    private MyList lst;

    public MyList(MyList a){
        this.lst = a;
    }

    public MyList append(MyList a){
        return new MyList(a);
    }
}
