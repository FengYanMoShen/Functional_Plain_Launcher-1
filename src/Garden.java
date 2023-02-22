public class Garden {
    // 定义花园中的植物
    public Plant plant;
    // 定义花园中的收获的数量
    public int harvestNum = 0;
    // 定义花园中的温度
    public double temperature;

    // 静态内部类，定义植物
    public static class Plant {

        public String plant_name;// 植物的名字

        public int plant_growth;// 植物的生长周期

        public int plant_Period;// 植物的种植期

        public int plant_income;// 植物的收益

        // 植物的构造函数
        public Plant(String name, int growth, int plantPeriod, int income) {
            this.plant_name = name;
            this.plant_growth = growth;
            this.plant_Period = plantPeriod;
            this.plant_income = income;
        }
    }

    // 植物种植
    public void plant(String name, int growth, int plantPeriod, int income) {
//        plant = new Plant(name, growth, plantPeriod, income);
        System.out.println("植物：" + name + "种植成功！");
    }

    // 植物生长
    public void grow() {
        if (plant != null) {
            // 假定每天温度都是25
            temperature = 25;
            // 植物的生长周期减一
            plant.plant_growth--;
            // 如果植物的生长周期等于0
            if (plant.plant_growth == 0) {
                // 收获的数量加上植物的收益
                harvestNum += plant.plant_income;
                // 植物种植期重新设置
                plant.plant_growth = plant.plant_Period;
                System.out.println("植物：" + plant.plant_name + "收获成功！收获的数量：" + plant.plant_income);
            }
        } else {
            System.out.println("种植植物！");
        }
    }
}
