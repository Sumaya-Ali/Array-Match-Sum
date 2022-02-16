package ArrayMatchSum.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ArrayMatchSum.Model.ArraySum;
import ArrayMatchSum.Service.ArraySumService;

@RestController	
public class ArraySumController {

	@Autowired
	private ArraySumService ArraySumService;
	
	@RequestMapping(method=RequestMethod.POST,value="/ArraySum")
	public  int[] ifPairExistWithGivenSumSorting(@RequestBody ArraySum arraySum) {			
			return ArraySumService.ifPairExistWithGivenSumSorting(arraySum);
	}
}
