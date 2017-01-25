#Categories for testing - Joose Lab 2017
#
#This specification is designed to test addItem in the invmgt package 
#This is the first revision of the exercise
#
#

# Input item - Item
Environments:
  Item configuration:
     Complete item.							
	 Incomplete item.						
  Supplier configuration:
	 Has items.								[property hasitems]
     No items.								[if !hasitems]
	 Has two items with matching names.		[if hasitems]

	

# Input long - barcode
  Size:
     Empty.									[property emptybarcode]				
	 Not empty.
	 
  Presence of characters:
     None.									[if !emptybarcode]
	 Characters.							[if !emptybarcode] [property charbarcode]
  
  Value:
     More than 99 less than 9999.			[if !emptybarcode && !charbarcode] [property correctbarcode]
	 <99.									[if !emptybarcode && !charbarcode && !correctbarcode]
	 >9999.									[if !emptybarcode && !charbarcode && !correctbarcode]
			


# Input String - itemName
  Length:
     Empty.									[property emptyname]
	 Not empty.

  Content:
	 No special characters.					[if !emptyname] [property nocharsitem]
     None.									[if !emptyname && !nocharsitem] 
     Special characters.					[if !emptyname && !nocharsitem]
	 



# Input String - itemType	 
  Length:
     Empty.									[property emptytype]
	 Not empty.								[if !emptytype]



# Input int - qty
  Size:
     Empty.									[property emptyqty]
	 Not empty.								[if emptyqty]
		 
  Presence of characters:
	None.									[if !emptyqty]
	Characters.								[if !emptyqty] [property charqty]
	 
  Value:
	More than or equal to 0 less than 100.  [if !emptyqty && !charqty] [property correctqty]
    0.										[if !emptyqty && !charqty && !correctqty]
	<0.										[if !emptyqty && !charqty && !correctqty]	
	>100.									[if !emptyqty && !charqty && !correctqty]





# Input String - supplier
  Length:
     Empty.									[property emptysupplier]
	 Not empty.
	 
  Content:
	 No special characters.					[if !emptysupplier] [property correctsupplier]
     None.									[if !emptysupplier && !correctsupplier] 
	 Special characters.					[if !emptysupplier && !correctsupplier]
	 
