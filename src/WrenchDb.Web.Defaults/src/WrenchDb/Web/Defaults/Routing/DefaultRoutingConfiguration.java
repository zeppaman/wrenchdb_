package WrenchDb.Web.Defaults.Routing;

/* 
 * Copyright (C) 2013 Daniele Fontani
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import WrenchDb.Core.Annotations.ItemAppenderConfigurator;
import WrenchDb.Core.Configuration.ItemAppendingConfiguration;
import WrenchDb.MVC.BaseClasses.RoutingConfiguration;
import WrenchDb.MVC.Configuration.RouteMap;
import java.util.ArrayList;

@ItemAppenderConfigurator(Name = "RouteMapSet")
public class DefaultRoutingConfiguration 
    extends  ItemAppendingConfiguration<RouteMap> {

            @Override
            public void Configure(ArrayList<RouteMap> configuration)
            {
                RouteMap map=  new RouteMap();
                map.setName("DefaultController");
                map.setUrl("/{controller}/{action}/{id}");
                map.setDefaultActionName("Index");
                map.setDefaultControllerName("DefaultController");

                configuration.add(map);
                
                map=  new RouteMap();
                map.setName("DefaultController");
                map.setUrl("/");
                map.setDefaultActionName("Index");
                map.setDefaultControllerName("DefaultController");

                configuration.add(map);
                
                
            
                
            }
       
    }
    
    

