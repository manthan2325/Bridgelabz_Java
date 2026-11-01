package JavaDesignPatterns.BuilderPattern;

class Computer
{
    private String ram;
    private String Storage;
    private String processor; 
    private String graphicsCard;

    private Computer(Builder builder)
    {
        this.ram = builder.ram;
        this.Storage = builder.Storage;
        this.processor = builder.processor;
        this.graphicsCard = builder.graphicsCard;
    }
    public void display()
    {
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + Storage);
        System.out.println("Processor: " + processor);
        System.out.println("Graphics Card: " + graphicsCard);
    }
    static class Builder
    {
        private String ram;
        private String Storage;
        private String processor; 
        private String graphicsCard;

        public Builder setRam(String ram)
        {
            this.ram=ram;
            return this;
        }
        public Builder setStorage(String Storage)
        {
            this.Storage=Storage;
            return this;
        }
        public Builder setProcessor(String processor)
        {
            this.processor=processor;
            return this;
        }
        public Builder setGraphicsCard(String graphicsCard)
        {
            this.graphicsCard=graphicsCard;
            return this;
        }
        public Computer build()
        {
            return new Computer(this);
        }

    }
}

public class BuilderPattern 
{
    public static void main(String[] args) 
    {
        Computer computer =  new Computer.Builder()
                .setRam("16GB")
                .setStorage("1TB")
                .setProcessor("Intel i7")
                .setGraphicsCard("NVIDIA GTX 3080")
                .build();
        computer.display();
    }
}
