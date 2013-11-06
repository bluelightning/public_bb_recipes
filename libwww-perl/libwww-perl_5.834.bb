SUMMARY = "libwww-perl provides a simple and consistent API to the World Wide Web"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/release/libwww-perl"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=b7d978c7767cb9fb392f80103af8ca0a"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/libwww-perl-${PV}.tar.gz"
SRC_URI[libwww-perl-5.834.md5sum] = "f2ed8a461f76556c9caed9087f47c86c"
SRC_URI[libwww-perl-5.834.sha256sum] = "1a50eb91d1deeca3be10982e129e786809ad6f0f8049b156e91e889e5a7288ff"

S = "${WORKDIR}/libwww-perl-${PV}"

inherit cpan

RDEPENDS_${PN} += "libdigest-md5-perl \
                   libencode-perl \
                   libencode-locale-perl \
                   libfile-listing-perl \
                   libhtml-entities-perl \
                   libhtml-headparser-perl \
                   libhttp-date-perl \
                   libhttp-cookies-perl \
                   libhttp-daemon-perl \
                   libhttp-negotiate-perl \
                   libhttp-request-perl \
                   libhttp-request-common-perl \
                   libhttp-response-perl \
                   libhttp-status-perl \
                   libio-select-perl \
                   libio-socket-perl \
                   liblwp-mediatypes-perl \
                   libmime-base64-perl \
                   libnet-ftp-perl \
                   libnet-http-perl \
                   liburi-perl \
                   liburi-escape-perl \
                   libwww-robotrules-perl \
                   "

RPROVIDES_${PN} += "liblwp-perl \
                    liblwp-authen-ntlm-perl \
                    liblwp-conncache-perl \
                    liblwp-debug-perl \
                    liblwp-membermixin-perl \
                    liblwp-protocol-perl \
                    liblwp-robotua-perl \
                    liblwp-simple-perl \
                    liblwp-useragent-perl \
                    liblwp-authen-basic-perl \
                    liblwp-authen-digest-perl \
                    liblwp-protocol-cpan-perl \
                    liblwp-protocol-data-perl \
                    liblwp-protocol-file-perl \
                    liblwp-protocol-ftp-perl \                    
                    liblwp-protocol-ghttp-perl \                    
                    liblwp-protocol-gopher-perl \
                    liblwp-protocol-http-perl \                    
                    liblwp-protocol-http-socket-perl \                    
                    liblwp-protocol-http-socketmethods-perl \                    
                    liblwp-protocol-loopback-perl \
                    liblwp-protocol-mailto-perl \
                    liblwp-protocol-myftp-perl \
                    liblwp-protocol-nntp-perl \
                    liblwp-protocol-nogo-perl \
                    "

BBCLASSEXTEND = "native"
