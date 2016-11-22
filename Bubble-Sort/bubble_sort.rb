## Bubble Sort - Ruby

class BubbleSort

  def self.bubble_sort(lst)

    return lst if lst.size <= 1

    loop do
      sorted = false

      (lst.size-1).times do |i|
        if lst[i] > lst[i+1]
          lst[i], lst[i+1] = lst[i+1], lst[i]
          sorted = true
        end
      end

      break if not sorted

    end

    lst

  end

  p bubble_sort([0])
  p bubble_sort([1, 2, 3, 4, 5])
  p bubble_sort([5, 4, 3, 2, 1, 6, 8, 8])
  p bubble_sort([4, 5, 3, 1, 2, 16, 9, 66])

end