public class Day1 {

    public static void day1() {
        String input = "128270\n" +
                "147113\n" +
                "61335\n" +
                "78766\n" +
                "119452\n" +
                "116991\n" +
                "70640\n" +
                "145446\n" +
                "117606\n" +
                "135046\n" +
                "70489\n" +
                "131072\n" +
                "67955\n" +
                "66424\n" +
                "126450\n" +
                "101418\n" +
                "90225\n" +
                "66004\n" +
                "136510\n" +
                "61695\n" +
                "143880\n" +
                "53648\n" +
                "58699\n" +
                "119214\n" +
                "83838\n" +
                "95895\n" +
                "66388\n" +
                "66755\n" +
                "120223\n" +
                "79310\n" +
                "93828\n" +
                "136686\n" +
                "108958\n" +
                "140752\n" +
                "85343\n" +
                "103800\n" +
                "126602\n" +
                "147726\n" +
                "88228\n" +
                "83380\n" +
                "77877\n" +
                "61922\n" +
                "75448\n" +
                "67095\n" +
                "60888\n" +
                "136692\n" +
                "63271\n" +
                "113742\n" +
                "68854\n" +
                "86904\n" +
                "110243\n" +
                "104642\n" +
                "141854\n" +
                "71205\n" +
                "76729\n" +
                "138540\n" +
                "134142\n" +
                "62517\n" +
                "63306\n" +
                "71363\n" +
                "126146\n" +
                "74749\n" +
                "76716\n" +
                "59135\n" +
                "62449\n" +
                "110575\n" +
                "134030\n" +
                "84072\n" +
                "122698\n" +
                "96891\n" +
                "69976\n" +
                "94501\n" +
                "149180\n" +
                "57944\n" +
                "64873\n" +
                "68192\n" +
                "138238\n" +
                "119185\n" +
                "137570\n" +
                "79274\n" +
                "111040\n" +
                "142586\n" +
                "120872\n" +
                "63586\n" +
                "78628\n" +
                "122704\n" +
                "147951\n" +
                "102593\n" +
                "105562\n" +
                "55180\n" +
                "64450\n" +
                "87466\n" +
                "112522\n" +
                "60000\n" +
                "149885\n" +
                "52154\n" +
                "80633\n" +
                "61867\n" +
                "86380\n" +
                "136024";
        String[] inputs = input.split("\n");
        double total = 0;

        for (String s : inputs) {
            int module = Integer.parseInt(s);
            double fuelForModule = calculateFuelForModule(module);
            total += fuelForModule;
            total += calculateFuelsFuel(fuelForModule);
        }
        System.out.println(total);
    }

    public static double calculateFuelForModule(double value) {
        return Math.floor(value / 3) - 2;
    }

    public static double calculateFuelsFuel(double value) {
        if (calculateFuelForModule(value) > 0) {
            return calculateFuelForModule(value) + calculateFuelsFuel(calculateFuelForModule(value));
        } else {
            return 0;
        }
    }

}
