# Spring
=> 1 Create a java project
=> 2 import these files into eclipse
=> 3 Add all the jars to the project using the configure build path

=> registerShutdownHook() method that is declared on the AbstractApplicationContext class will ensures a graceful shutdown and calls the relevant destroy methods.

The BeanPostProcessor interface defines callback methods that you can implement to provide your own instantiation logic, dependency-resolution logic etc. You can also implement some custom logic after the Spring container finishes instantiating, configuring, and initializing a bean by plugging in one or more BeanPostProcessor implementations.
  
  BeanPostProcessor has two methods:
  
  	@Override
  	public Object postProcessAfterInitialization(Object bean, String beanName){
		//return bean obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName){
		  //return bean obj;
	}
