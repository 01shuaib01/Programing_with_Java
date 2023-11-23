import java.util.*;
 class ColllectionFaramework {
    public static void main(String[] args){
        // 1.list (ArrayList)
            // add
            //remove(index)
            //remove(Integer.valueOf(value))
            //clear
            //contains(value)
            //set(index,updated value)
            //for(Integer ele : list){
                // sop(ele)
            // }
            // iterator<Integer>it = list.iterator();

            // List<Integer>list = new ArrayList<>();
            // list.add(10);
            // list.add(20);
            // list.add(30);

            //System.out.println(list);
            // for(Integer value : list){
            //     System.out.println(value);
            // }
            
            // Iterator<Integer>it = list.iterator();
            // while(it.hasNext()){
            //     System.out.println(it.next());
            // }
        
            // List<Integer>list = Arrays.asList(1,2,33,4,6);
            // Integer maxi = Collections.max(list);
            // System.out.println(maxi);


        // 2. stack
            // Stack<String> animals= new Stack<>();
                
            // animals.push("Lion");
            // animals.push("Dog");
            // animals.push("Horse");
            // animals.push("Cat");

            // System.out.println("Stack: " + animals);

            // System.out.println(animals.peek());

            // animals.pop();

            // System.out.println("Stack: " + animals);

            // System.out.println(animals.peek());


        // 3. Set
                // Set<Integer> set = new HashSet<>();
                // Set<Integer> set = new LinkedHashSet<>();
                Set<Integer> set = new TreeSet<>();
            
                   set.add(32);
                   set.add(2);
                   set.add(54);
                   set.add(21);
                   set.add(65);
            
                   System.out.println(set);
            
                   set.remove(54);
            
                //    System.out.println(set);
            
                //    System.out.println(set.contains(21));
            
                //    System.out.println(set.isEmpty());
            
                //    System.out.println(set.size());
            
                //    set.clear();
            
                //    System.out.println(set);




    // 4. MAP
    Map<String, Integer> numbers = new TreeMap<>();
    // // unordered_map<int,int>map;//c++

    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three", 3);
    numbers.put("Four", 4);
    numbers.put("Five", 5);
    
    // numbers.put("Two",44);

    // numbers.remove("Three");

       if(!numbers.containsKey("Two")) {
           numbers.put("Two", 23);
       }

//        numbers.putIfAbsent("Two", 23);
            // numbers.put("Two",40);
    System.out.println(numbers);
    // System.out.println(numbers.containsValue(3));

    // System.out.println(numbers.isEmpty());

    //    for (Map.Entry<String, Integer> e: numbers.entrySet()) {
    //        System.out.println(e);

    //        System.out.println(e.getKey());
    //        System.out.println(e.getValue());
    //    }

//        for (String key: numbers.keySet()) {
//            System.out.println(key);
//        }
//
//        for(Integer value: numbers.values()) {
//            System.out.println(value);
//        }

    }
}


// int arr[] = {1,2,3,2,4};

// unordered_map<int,int>map;

// for(int i = 0;i<arr.size();i++){
//     map[arr[i]]++;
// }

// for(auto i : map){
//     if(i.second > 1)
//         return i.first;
// }