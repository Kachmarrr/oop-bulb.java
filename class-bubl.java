public class Bulb {
        private String NameOfBulb;
        private String Color;
        private String Status;

        public Bulb(String defNameOfBulb, String defColor, String defStatus){
            NameOfBulb = defNameOfBulb;
            Color = defColor;
            Status = defStatus;
        }

        public String getNameOfBulb(){
            return NameOfBulb;
        }

        public String getColor(){
            return Color;
        }
        public String getStatus(){
            return Status;
        }

        public void setNameOfBulb(String newNameOfBulb){
            NameOfBulb = newNameOfBulb;
        }

        public void setColor(String newColor){
            Color = newColor;
        }

        public void setStatus(String newStatus) {
            Status = newStatus;
        }


        public String getinfo(){
            System.out.println(NameOfBulb);
            System.out.println(Color);
            System.out.println(Status);
            return null;
        }
}
