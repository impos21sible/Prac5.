package classes;

public class Animal {
    public String say() {
        return "I'm an Animal!";
    }
}

class Dog extends Animal{
    @Override
    public String say() {
        return "woof";
    }
}
class Cat extends Animal {
    @Override
    public String say() {
        return "meow";
    }
}
class Bird extends Animal{
    @Override
    public String say() {
        return "tweet";
    }
}

class Mouse extends Animal{
    @Override
    public String say() {
        return "squeek";
    }
}

class Cow extends Animal {
    @Override
    public String say() {
        return "moo";
    }

}
class Frog extends Animal {
    @Override
    public String say() {
        return "croak";
    }

}

class Elephant extends Animal {
    @Override
    public String say() {
        return "toot";
    }

}
class Ducks extends Animal {
    @Override
    public String say() {
        return "quack";
    }

}

class Fish extends Animal {
    @Override
    public String say() {
        return "blub";
    }
}
class Seal extends Animal {
    @Override
    public String say() {
        return "ow ow ow";
    }
}





