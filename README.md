# first-repo
This is my first Repository.
<bean id="sessionFactory" class="org.springframework.orm.hibernate4.LocalSessionFactoryBean">
		
		<property name="dataSource" ref="d"/>
		<property name="annotatedClasses">
			<list>
				<value>com.model.CountryModel</value><!--vo file destination-->
				<value>com.model.StateModel</value>
			</list>
		</property>
		
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</prop>
				<prop key="hibernate.show_sql">true</prop>
				<prop key="hibernate.hbm2ddl.auto">update</prop>
			</props>
		</property>
	
	</bean>
